public class RemoveDupeInString {
    public static void removeduplicate(String str, StringBuilder nonduped, int index, boolean[] map ){
        if(index == str.length()){
            System.out.println("output : "+nonduped);
            return;
        }

        char current = str.charAt(index);
        if(map[current - 'a'] == true){
            removeduplicate(str, nonduped, index+1, map);
        }else{
            map[current - 'a'] = true;
            removeduplicate(str, nonduped.append(current), index+1, map);
        }
    }
    public static void main(String[] args) {
        String str = "eneegnelgisgeh";
        System.out.println("\n");
        System.out.println("input : "+str);
        removeduplicate(str, new StringBuilder(""), 0, new boolean[26]);
        System.out.println("\n");

    }
}
