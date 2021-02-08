package ch2;

// 一个简单的token
// 只有类型和文本值两个属性
public interface Token {

    // 获取token的类型
    public TokenType getType();

    // 获取token的文本值
    public String getText();

}