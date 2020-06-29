import java.io.FileWriter;
import java.io.IOException;

public class Writer {
	
				private String room;
				private String id;
				public void setroom(String room,String id){
					this.room=room;
					this.id=id;
				}
				public void write() throws IOException{
				FileWriter fw = new FileWriter("C:\\Users\\朱\\workspace\\web\\src\\room.txt",true);
		        
		        fw.write(room+"\r\n"+id+"\r\n");
		        fw.flush();
		        fw.close();
				}

}
