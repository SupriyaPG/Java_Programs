package Ex07_oopsConcept_classMethodObj.interfaceDemo;


interface vehicleInfo
{
  //  public void(String name);
    //public void (String model);
    String name="";
    String model="";


}

class Tesla implements vehicleInfo {

}

class  Tata implements vehicleInfo {


}
public class vehicle {
    public static void main(String[] args) {
    vehicleInfo vi=new Tesla();
    vehicleInfo vi2=new Tata();
    }
}
