public class University {
    public static void main(String args[]){
        CodeAdapter Knowledgecode = new CodeAdapter();
        CapstoneProject FEnd = new CapstoneProject();
        FEnd.setK(Knowledgecode);

        FEnd.writeCode("ReactJS");
        FEnd.writeCode("ExpressJS");

    }

}
