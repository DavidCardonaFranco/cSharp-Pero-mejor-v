/* Generated By:JJTree: Do not edit this line. ASTVariableValue.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=BaseNode,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package Aritmetica;

public
class ASTVariableValue extends SimpleNode {
  public ASTVariableValue(int id) {
    super(id);
  }

  public ASTVariableValue(ExpressionParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ExpressionParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=9f7a2ed6f3adb6a1948d389bb1b1f588 (do not edit this line) */
