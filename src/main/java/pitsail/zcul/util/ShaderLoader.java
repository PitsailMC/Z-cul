package pitsail.zcul.util;

public interface ShaderLoader {
    int getFrameBufferID();

    boolean renderingShaderPass();

    boolean enabledShader();

    void bindDefaultFrameBuffer();
}
