/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.akshay.hint;

import org.netbeans.spi.editor.hints.ErrorDescription;
import org.netbeans.spi.java.hints.ConstraintVariableType;
import org.netbeans.spi.java.hints.ErrorDescriptionFactory;
import org.netbeans.spi.java.hints.Hint;
import org.netbeans.spi.java.hints.HintContext;
import org.netbeans.spi.java.hints.TriggerPattern;
import org.openide.util.NbBundle.Messages;

@Hint(displayName = "#DN_textBlockHint", description = "#DESC_textBlockHint", category = "general")
@Messages({
    "DN_textBlockHint=TextBlock to String",
    "DESC_textBlockHint=convert text block to string"
})
public class textBlockHint {

    @TriggerPattern(value = "@str=\"\"\"\n\"\"\"", //Specify a pattern as needed
            constraints = {@ConstraintVariableType(variable = "$str", type = "java.lang.String")})
    @Messages("ERR_textBlockHint=text block is not supported in java versions older then 13")
    public static ErrorDescription computeWarning(HintContext ctx) {
        return ErrorDescriptionFactory.forName(ctx, ctx.getPath(), Bundle.ERR_textBlockHint());
    }

}
