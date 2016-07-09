package dz.ansej.gui.common;

import java.util.ArrayList;
import java.util.List;

import javax.swing.ListModel;
import javax.swing.event.ListDataListener;

/**
 * 
 * @author lyes kherbiche
 * @author ⴻⵍⵢⴰⵙ ⵅⴻⵔⴱⵉⵛ
 *
 */
public class AnsejListModel implements ListModel<Object> {
	private static List<Object> data = new ArrayList<Object>();

	public int getSize() {
		return data.size();
	}

	public Object getElementAt(int index) {
		return data.get(index);
	}

	public void addListDataListener(ListDataListener l) {
		// TODO Auto-generated method stub
		
	}

	public void removeListDataListener(ListDataListener l) {
		// TODO Auto-generated method stub
		
	}
	
	public static void addElement(int index, Object obj) {
		/*try {
			data.set(index, obj);
		}catch (IndexOutOfBoundsException e) {
			data.add(index, obj);
		}*/
		if(data.size() <= index) {
			data.add(index, obj);
		} else
			data.set(index, obj);
	}
	
	public static List<Object> getData() {
		return data;
	}

}
