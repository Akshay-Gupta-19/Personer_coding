/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HIntTest;

import com.sun.source.tree.LiteralTree;
import com.sun.source.tree.Tree;
import com.sun.source.util.TreePath;
import org.netbeans.api.java.source.CompilationInfo;
import org.netbeans.spi.editor.hints.ErrorDescription;
import org.netbeans.spi.editor.hints.Fix;
import org.netbeans.spi.java.hints.ConstraintVariableType;
import org.netbeans.spi.java.hints.ErrorDescriptionFactory;
import org.netbeans.spi.java.hints.Hint;
import org.netbeans.spi.java.hints.HintContext;
import org.netbeans.spi.java.hints.JavaFix;
import org.netbeans.spi.java.hints.TriggerPattern;
import org.netbeans.spi.java.hints.TriggerTreeKind;
import org.openide.util.NbBundle.Messages;

@Hint(displayName = "#DN_ToString", description = "#DESC_ToString", category = "general")
@Messages({
    "DN_ToString=StringConvTest",
    "DESC_ToString=converting to string des"
})
public class ToString {

     @TriggerTreeKind(Tree.Kind.STRING_LITERAL)
    @Messages("ERR_ToString=convert to string warning")
    public static ErrorDescription computeWarning(HintContext ctx) {
        String orignalString = (String) ((LiteralTree) ctx.getPath().getLeaf()).getValue();
        Fix fix = new FixImpl(ctx.getInfo(), ctx.getPath(),orignalString).toEditorFix();
        return ErrorDescriptionFactory.forName(ctx, ctx.getPath(), Bundle.ERR_ToString(), fix);
    }

    private static final class FixImpl extends JavaFix {
        String os;
        public FixImpl(CompilationInfo info, TreePath tp,String os) {
            super(info, tp);
            this.os=os;
        }

        @Override
        @Messages("FIX_ToString=Convert to string Fix")
        protected String getText() {
            return Bundle.FIX_ToString();
        }

        @Override
        protected void performRewrite(TransformationContext ctx) {
            ctx.getWorkingCopy().rewrite(ctx.getPath().getLeaf(), ctx.getWorkingCopy().getTreeMaker().Literal(os+" "));
        }
    }
}
