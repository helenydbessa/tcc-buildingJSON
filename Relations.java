import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collectors;

public class Relations {
    public static void main(String[] args) {
//        ArrayList<String> listT1 = new ArrayList<>();
//        ArrayList<String> listT2 = new ArrayList<>();
//        ArrayList<String> listT3 = new ArrayList<>();
        Conditions.CreatingList(Conditions.list);
        ArrayList<String> listAtt = Conditions.list;
        System.out.println("Conditions:");
        System.out.print("[");
        for(String att : listAtt) {
            System.out.print("\"" + att + "\", ");
        }
        System.out.print("],");

        int numObjects = 0;
        JSONParser parser = new JSONParser();
        Object json = null;
        try {
//            System.out.println("owo");
            BufferedReader bufferedReader = java.nio.file.Files.newBufferedReader(Paths.get("data4pqfuditudo.json"));
//            BufferedReader bufferedReader = java.nio.file.Files.newBufferedReader(Paths.get("data2.json"));
            json = parser.parse(bufferedReader);
            //Consertei indo no Notepad++ e selecionando o encoding UTF8 *SEM* BOM
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        JSONObject jsonObject = (JSONObject) json;
        System.out.println("[");
//        System.out.println(jsonObject.keySet());
//        Set<String> set = (Set) jsonObject.keySet()
//                .stream()
//                .filter(s -> s.toString().startsWith("T1"))
//                .collect(Collectors.toSet());
//        System.out.println(set.size());
//        Iterator<String> oie = set.iterator();
//        System.out.println("ehe");
//        while(oie.hasNext()) {
//            System.out.println(oie.next());
//            System.out.println("oof");
//        }
//        System.out.println("heh");

//        JSONArray relations = (JSONArray) jsonObject.get("relations");
        JSONArray relations = (JSONArray) jsonObject.get("Sheet1");
//        System.out.println(relations);
        Iterator<JSONObject> iterator = relations.iterator();
        System.out.println("\nRelations:");
        while (iterator.hasNext()) {
            numObjects++;
            System.out.println("[");
//            System.out.println(iterator.next());
//            System.out.println(iterator.next().keySet());
            JSONObject it = iterator.next();
            Set<String> set1 = (Set) it.keySet()
                .stream()
                .filter(s -> s.toString().startsWith("T1"))
                .collect(Collectors.toSet());
            System.out.print("[");
            for(String setComponent : set1) {
//                listT1.add(setComponent);
                System.out.print("\"" + setComponent + "\", ");
            }
            System.out.print("], ");

            Set<String> set2 = (Set) it.keySet()
                .stream()
                .filter(s -> s.toString().startsWith("T2"))
                .collect(Collectors.toSet());
//            System.out.println(set2);
            System.out.print("[");
            for(String setComponent : set2) {
//                listT2.add(setComponent);
                System.out.print("\"" + setComponent + "\", ");
            }
            System.out.print("], ");

            Set<String> set3 = (Set) it.keySet()
                .stream()
                .filter(s -> s.toString().startsWith("T3"))
                .collect(Collectors.toSet());
            System.out.print("[");
            for(String setComponent : set3) {
//                listT3.add(setComponent);
                System.out.print("\"" + setComponent + "\", ");
            }
            System.out.print("]");

//        System.out.println("hello");
//        for(String i : listT2) {
//            System.out.println(i);
//        }
            System.out.println();
            System.out.println("],");
//            listT1.clear();
//            listT2.clear();
//            listT3.clear();
        }
        System.out.println("]");

        System.out.println("\nObjects:");
        Counting.countingObjs(numObjects);
    }
    /*
    update 1: tava dando biziu de classe errada porque o formato de relations que eu estava usando não era o deste site: https://beautifytools.com/excel-to-json-converter.php
    ou seja [{},{},{}...]

    update 2: usar só o documento que é gerado do excel no site acima, o json para o lm monta depois com o que sair daqui
     */
}
