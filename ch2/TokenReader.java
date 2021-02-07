package ch2;

// 一个token 流
public interface TokenReader {

    // 返回Token流中的下一个Token, 并且从流中取出
    // 如果流已经为空，返回null;
    public Token read();

    // 返回Token流中的下一个Token, 但不从流中取出
    // 如果流已经为空，返回null;
    public Token peek();

    // Token流回退一步，恢复原来的Token
    public void unread();

    // 获取Token流当前的读取位置
    public int getPosition();

    // 设置Token流当前的读取位置
    public void setPosition(int Position);

}
