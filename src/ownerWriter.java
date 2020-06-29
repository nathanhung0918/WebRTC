import java.io.FileWriter;
import java.io.IOException;

public class ownerWriter {
	
				private String room;
				public void setroom(String room){
					this.room=room;
				}
				public void write() throws IOException{
				FileWriter fw = new FileWriter("C:\\Users\\朱\\workspace\\web\\src\\roomOwner.txt",true);
		        
		        fw.write(room+"\r\n");
		        fw.flush();
		        fw.close();
				}

}
