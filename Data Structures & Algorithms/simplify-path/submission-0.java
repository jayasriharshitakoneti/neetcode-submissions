class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack=new Stack<>();

        String[] pathsInArray=path.split("/");

        for(int i=0;i<pathsInArray.length;i++){
            if(pathsInArray[i].equals("..")){
                if(stack.size()>0)
                stack.pop();
            }
            else if(pathsInArray[i].equals(".")){
                continue;
            }else{
                if(pathsInArray[i].length()>0)
                stack.push(pathsInArray[i]);
            }
        }

        if(stack.size()==0){
            return "/";
        }

        StringBuilder result=new StringBuilder();

        int size=stack.size();
        for(int i=0;i<size;i++){
            result.insert(0,stack.pop());
            result.insert(0,"/");
        }

        
        return result.toString();
    }
}