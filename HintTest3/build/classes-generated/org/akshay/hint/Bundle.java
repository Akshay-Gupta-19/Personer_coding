package org.akshay.hint;
/** Localizable strings for {@link org.akshay.hint}. */
class Bundle {
    /**
     * @return <i>convert text block to string</i>
     * @see textBlockHint
     */
    static String DESC_textBlockHint() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "DESC_textBlockHint");
    }
    /**
     * @return <i>TextBlock to String</i>
     * @see textBlockHint
     */
    static String DN_textBlockHint() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "DN_textBlockHint");
    }
    /**
     * @return <i>text block is not supported in java versions older then 13</i>
     * @see textBlockHint
     */
    static String ERR_textBlockHint() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ERR_textBlockHint");
    }
    private Bundle() {}
}
