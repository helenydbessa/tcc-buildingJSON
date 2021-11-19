import java.util.ArrayList;

public class Conditions {
	static ArrayList<String> list = new ArrayList<>();
	public static void main(String[] args) {
		CreatingList(list);
		System.out.print("[");
		for(String att : list) {
			System.out.print("\"" + att + "\", ");
		}
		System.out.print("],");
	}

	public static void CreatingList(ArrayList<String> list) {
		list.add("BLK_1");
		list.add("RISK_1");
		list.add("BLK_2");
		list.add("OC_1");
		list.add("SELFC_1");
		list.add("RISK_2");
		list.add("CON_1");
		list.add("SELFC_2");
		list.add("SOC_1");
		list.add("BLK_3");
		list.add("OC_2");
		list.add("RISK_3");
		list.add("SELFC_3");
		list.add("BLK_4");
		list.add("CON_2");
		list.add("SELFP_1");
		list.add("SOC_2");
		list.add("DEP_1");
		list.add("RISK_4");
		list.add("OC_3");
		list.add("CON_3");
		list.add("BLK_5");
		list.add("SOC_3");
		list.add("DEP_2");
	}
}