import com.iflytek.utilS.VerifyCodeUtils;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class VerifyCodeTest {
    @Test
    public void testGenerateVerifyCode() throws IOException {
        String verifyCode = VerifyCodeUtils.generateVerifyCode(4);
        System.out.println(verifyCode);
        //写入图片
        File codeImg = new File(
                "D:\\BookDome\\BookDome\\src\\main\\webapp\\image\\generateImgCode.png"
        );
        FileOutputStream outputStream = new FileOutputStream(codeImg);
        VerifyCodeUtils.outputImage(220,60,outputStream,verifyCode);
    }
}
