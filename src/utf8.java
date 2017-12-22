import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
public class utf8{
   public static void main(String[] args) throws UnsupportedEncodingException{
	String word="sigp发送 回复td退订";
	String utf8=URLEncoder.encode(word, "UTF-8");
	String GBK=URLEncoder.encode(word, "gbk");
	String gbk=URLDecoder.decode(utf8,"GBK");
	String UTF8=URLDecoder.decode(GBK,"UTF-8");
	System.out.println("原文："+word);
	System.out.println("utf8加密"+utf8);
	System.out.println("gbk加密"+GBK);
	System.out.println("utf8加密后用GBK解密"+gbk);
	System.out.println("GBK加密后用UTF8解密"+UTF8);
    }
}
