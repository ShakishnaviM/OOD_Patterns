public class CapstoneProject {
    private Knowledge k;

    public Knowledge getK(){
        return k;
    }
    public void setK(Knowledge k){
        this.k=k;
    }
    public void writeCode(String language){
        System.out.println("I am using "+language);
        k.developFrontEnd();

    }
}
