/* Generated By:JJTree: Do not edit this line. ASTNumber.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=BaseNode,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package Aritmetica;

public
class ASTNumber extends SimpleNode {
  public ASTNumber(int id) {
    super(id);
  }

  public ASTNumber(ExpressionParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ExpressionParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=6ba0b6bf5f09c3056a18c2e6b46b78b7 (do not edit this line) */
