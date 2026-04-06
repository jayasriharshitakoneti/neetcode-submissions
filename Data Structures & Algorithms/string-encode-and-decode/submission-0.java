class Solution {

    public String encode(List<String> strs) {
        String encoded="";
        for(int i=0;i<strs.size();i++){
            for(int j=0;j<strs.get(i).length();j++){
                int temp=strs.get(i).charAt(j);
                encoded+=""+temp+",";
            }
            encoded+=";";
        }
        return encoded;
    }

    public List<String> decode(String str) {
        List<String> decoded=new ArrayList<>();

        int i=0;
        String word="";
        String temp_ascii="";
        while(i<str.length()){
            if(str.charAt(i)==';'){
                decoded.add(word);
                word="";
            }else{
                if(str.charAt(i)==','){
                    int temp=Integer.parseInt(temp_ascii);
                    word+=""+(char) temp;
                    temp_ascii="";
                }else{
                    temp_ascii+=str.charAt(i);
                }
            }
            i++;
        }

        return decoded;
    }
}
