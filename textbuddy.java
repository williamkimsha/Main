import java.util.*;
import java.io.*;

public class textbuddy{


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String comd=st.nextToken();
		ArrayList<String> list=new ArrayList<String>();
		pr.println("Welcome to TextBuddy. "+args[0]+" is ready for use");
		pr.print("command: ");
		while(comd!="exit") {
			if (comd=="display") {
				if (list.size()==0)
					pr.println(args[0]+" is empty");
				else {
					for (int i=0;i<list.size();i++) {
						pr.print(i+". ");
						pr.println(list.get(i));
					}
				}
			}
			else if (comd=="delete") {
				int a= Integer.parseInt(st.nextToken());
				String removed=list.get(a);
				list.remove(a);
				pr.println("deleted from "+args[0]+" "+removed);
			}
			else if (comd=="clear") {
				list.clear();
				pr.println("all content deleted from "+args[0]);
			}
			else //if (comd==add)
			{	
				String newEntry="";
				String appended=st.nextToken();
				while(appended!=null) {
					newEntry=newEntry+appended;
					appended=st.nextToken();
				}
				list.add(newEntry);
				pr.println("added to "+args[0]+": “"+newEntry+"”");
			}
			pr.print("command: ");
			st=new StringTokenizer(br.readLine());
		}		
	}
}