package pitsail.zcul.instanced;

import pitsail.zcul.instanced.attribute.GLFloatVertex;
import pitsail.zcul.instanced.attribute.GLVertex;

import java.nio.FloatBuffer;
import java.util.function.Consumer;

public class PixelVertexBuffer extends VertexAttrib {

    public PixelVertexBuffer(int index) {
        super(
                GLFloatVertex.createF2(index, "Position")
        );
    }

    public void addAttrib(Consumer<FloatBuffer> bufferConsumer) {}

    @Override
    public void init(Consumer<FloatBuffer> bufferConsumer) {
        bufferConsumer.accept(this.buffer);
        int count = 0;
        for(GLVertex vertex : vertices) {
            count += vertex.size();
        }
        setVertexCount(this.buffer.limit()/count);
    }

    @Override
    public boolean needUpdate() {
        return false;
    }
}
