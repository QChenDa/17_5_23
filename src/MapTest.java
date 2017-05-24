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
				System.out.println("请输入课程 ID：");
				String id=console.next();
				course cr=courses.get(id);
				if(cr==null){
					 System.out.println("请输入课程名称：");
					 String name=console.next();
					 course newcourse=new course(id,name);
					 courses.put(id, newcourse);
					 System.out.println("成功添加课程：" + courses.get(id).name);
				}
				else {
					System.out.println("该课程 ID 已被占用");
	                continue;
				}
			}
		}
		public void testKeySet() {
			Set<String> KeySet=courses.keySet();
			for(String crID:KeySet){
				course cr=courses.get(crID);
				if(cr!=null){
					System.out.println("课程：" + cr.name);
				}
			}
			
		}
		public void testRemove() {
			Scanner console=new Scanner(System.in);
			while(true){
				System.err.println("请输入要删除的课程 ID！");
				String ID=console.next();
				course cr=courses.get(ID);
				if(cr==null){
					System.out.println("该 ID 不存在！");
					continue;
				}
				courses.remove(ID);
				System.out.println("成功删除课程" + cr.name);
	            break;
			}
			
		}
		public void testEntrySet() {
			Set<Entry<String,course>> entryset= courses.entrySet();
			for(Entry<String,course> entry:entryset){
				 System.out.println("取得键：" + entry.getKey());
		            System.out.println("对应的值为：" + entry.getValue().name);
			}
		}
		public void testModify() {
			System.out.println("请输入要修改的课程 ID：");
			Scanner console  = new Scanner(System.in);
			while(true){
				String crID =console.next();
				course course = courses.get(crID);
				if(course == null){
					 System.out.println("该 ID 不存在！请重新输入！");
		                continue;
				}
				System.out.println("当前该课程 ID，所对应的课程为：" + course.name);
				System.out.println("请输入新的课程名称：");
				String name = console.next();
				course newCourse = new course(crID, name);
				courses.put(crID,newCourse);
				System.out.println("修改成功！");           
				break;
			}
		}
}
