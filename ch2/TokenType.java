package ch2;

// Token的类型
public enum TokenType {
    // 加减乘除
    Plus, Minus, Star, Slash,

    // 比较运算
    GE, GT, EQ, LE, LT,

    //
    SemiColon, // ;
    LeftParen, // (
    RightParen, // )

    Assignment, // =

    If, Else,

    Int,

    Identifier, // 标识符

    IntLiteral, // 整型字面量
    StringLiteral, // 字符串字面量

}