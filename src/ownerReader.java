import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ownerReader {
	private BufferedReader br;
	private String[] ch = new String[100];
	private int count = 0;
	private int i=0;
	public void read() throws IOException{
		        FileReader fr = new FileReader("C:\\Users\\朱\\workspace\\web\\src\\roomOwner.txt");
		        br = new BufferedReader(fr);
		        while (br.ready()){
		        	ch[count++] = br.readLine();
		        	
		        }
				
		        fr.close();
		        
	}
	public boolean isin(String room) throws IOException{
		for(i=0;i<count;i++){
			if(room.equals(ch[i])){
				return false;
			}
			
		}
		return true;
		
	}
}
