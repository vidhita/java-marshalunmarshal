import org.beanio.Marshaller;
import org. beanio.Unmarshaller;
import org.beanio.StreamFactory;
import org.beanio.builder.StreamBuilder;

public class Helper{

public static <T> T getData(String fixedLengthMsg, Class<T> dataType){
	StreamBuilder builder = new StreamBuilder("s1").format("fixedlength").addRecord(dataType);
	StreamFactory factory = StreamFactory.newInstance();
	factory.define(builder);
	
	Unmarshaller unmarshaller = factory.createUnmarshaller("s1");
	return (T) unmarshaller.unmarshal(fixedLengthMsg);
}

public static <T> String getData(T dataObject, Class<T> dataType){
	StreamBuilder builder = new StreamBuilder("s1").format("fixedlength").addRecord(dataType);
	StreamFactory factory = StreamFactory.newInstance();
	factory.define(builder);
	
	Marshaller marshaller = factory.createMarshaller("s1");
	return unmarshaller.unmarshal(dataObject).toString();
}


