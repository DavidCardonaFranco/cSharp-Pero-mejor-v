/* Generated By:JJTree: Do not edit this line. ASTDivideExpr.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=BaseNode,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package Aritmetica;

public
class ASTDivideExpr extends SimpleNode {
  public ASTDivideExpr(int id) {
    super(id);
  }

  public ASTDivideExpr(ExpressionParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ExpressionParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=09d77920485783f963b5fa7019eb6e38 (do not edit this line) */
