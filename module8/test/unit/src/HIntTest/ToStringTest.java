/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HIntTest;

import org.junit.Test;
import org.netbeans.modules.java.hints.test.api.HintTest;

/* TODO to make this test work:
   - to ensure that the newest Java language features supported by the IDE are available,
     regardless of which JDK you build the module with:
   -- for Ant-based modules, add "requires.nb.javac=true" into nbproject/project.properties
   -- for Maven-based modules, use dependency:copy in validate phase to create
      target/endorsed/org-netbeans-libs-javacapi-*.jar and add to endorseddirs
      in maven-compiler-plugin and maven-surefire-plugin configuration
      See: http://wiki.netbeans.org/JavaHintsTestMaven
 */
public class ToStringTest {

    @Test
    public void testWarningProduced() throws Exception {
        HintTest.create()
                .input("package test;\n"
                        + "public class Test {\n"
                        + "    public static void main(String[] args) {\n"
                        + "        assert args[0].equals(\"\");\n"
                        + "    }\n"
                        + "}\n")
                .run(ToString.class)
                .assertWarnings("3:23-3:29:verifier:" + Bundle.ERR_ToString());
    }

    @Test
    public void testFixWorking() throws Exception {
        HintTest.create()
                .input("package test;\n"
                        + "public class Test {\n"
                        + "    public static void main(String[] args) {\n"
                        + "        assert args[0].equals(\"\");\n"
                        + "    }\n"
                        + "}\n")
                .run(ToString.class)
                .findWarning("3:23-3:29:verifier:" + Bundle.ERR_ToString())
                .applyFix()
                .assertCompilable()
                //TODO: change to match expected output
                .assertOutput("package test;\n"
                        + "public class Test {\n"
                        + "    public static void main(String[] args) {\n"
                        + "        assert args[0].equals(\"\");\n"
                        + "    }\n"
                        + "}\n");
    }
}
