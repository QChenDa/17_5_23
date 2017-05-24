import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
public class MapTest {
		public Map<String,course> courses;
		public MapTest() {
			this.courses=new HashMap<String, course>();
		}
		public void testPut() {
			Scanner console=new Scanner(System.in);
			for(int i=0;i<3;i++){
				System.out.println("������γ� ID��");
				String id=console.next();
				course cr=courses.get(id);
				if(cr==null){
					 System.out.println("������γ����ƣ�");
					 String name=console.next();
					 course newcourse=new course(id,name);
					 courses.put(id, newcourse);
					 System.out.println("�ɹ���ӿγ̣�" + courses.get(id).name);
				}
				else {
					System.out.println("�ÿγ� ID �ѱ�ռ��");
	                continue;
				}
			}
		}
		public void testKeySet() {
			Set<String> KeySet=courses.keySet();
			for(String crID:KeySet){
				course cr=courses.get(crID);
				if(cr!=null){
					System.out.println("�γ̣�" + cr.name);
				}
			}
			
		}
		public void testRemove() {
			Scanner console=new Scanner(System.in);
			while(true){
				System.err.println("������Ҫɾ���Ŀγ� ID��");
				String ID=console.next();
				course cr=courses.get(ID);
				if(cr==null){
					System.out.println("�� ID �����ڣ�");
					continue;
				}
				courses.remove(ID);
				System.out.println("�ɹ�ɾ���γ�" + cr.name);
	            break;
			}
			
		}
		public void testEntrySet() {
			Set<Entry<String,course>> entryset= courses.entrySet();
			for(Entry<String,course> entry:entryset){
				 System.out.println("ȡ�ü���" + entry.getKey());
		            System.out.println("��Ӧ��ֵΪ��" + entry.getValue().name);
			}
		}
		public void testModify() {
			System.out.println("������Ҫ�޸ĵĿγ� ID��");
			Scanner console  = new Scanner(System.in);
			while(true){
				String crID =console.next();
				course course = courses.get(crID);
				if(course == null){
					 System.out.println("�� ID �����ڣ����������룡");
		                continue;
				}
				System.out.println("��ǰ�ÿγ� ID������Ӧ�Ŀγ�Ϊ��" + course.name);
				System.out.println("�������µĿγ����ƣ�");
				String name = console.next();
				course newCourse = new course(crID, name);
				courses.put(crID,newCourse);
				System.out.println("�޸ĳɹ���");           
				break;
			}
		}
}
