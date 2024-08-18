/* 
Class: SWEN-601 [Software Construction]
Name: Raga Lagudua Ganesan
Email: rl1158@g.rit.edu
The purpose of this assignment is to help us understand the concept of Objects(individual instance 
of a class) and define methods to modify or use them.
*/
package homework;

public class TelephoneTester {
    /**
     * The TelephoneTester class is used to test the functionality of the Telephone class.
     * @param args
     */
    public static void main(String[] args){
        Telephone landline = new Telephone("Landline");
        Telephone mobile = new Telephone("Mobile");
        Telephone satellite = new Telephone("Satellite");
        Telephone landline1 = new Telephone("Landline", 6667773);
        Telephone landline1111 = new Telephone("Landline", 6667773);
        Telephone mobile1 = new Telephone("Mobile", 6667774);
        Telephone satellite1 = new Telephone("Satellite", 6667775);
        Telephone landline2 = new Telephone("Landline", 7755884);
        Telephone mobile2 = new Telephone("Mobile", 7755887);
        Telephone satellite2 = new Telephone("Satellite", 7755889);
        Telephone landline3 = new Telephone("Landline");
        Telephone mobile3 = new Telephone("Mobile");
        Telephone satellite3 = new Telephone("Satellite");
        Telephone landline4 = new Telephone("Landline");
        Telephone mobile4 = new Telephone("Mobile");
        Telephone satellite4 = new Telephone("Satellite");

        landline.dial("5550002");
        mobile.dial("5550001");
        satellite.dial("5550003");

        landline.recentCalls();
        mobile.recentCalls();
        satellite.recentCalls();

        landline.redial();
        landline.disconnectCall();
        mobile.disconnectCall();
        satellite.dial("5550001");
        
        // Perform a series of dialing and disconnecting calls for landline
        landline.dial("6667773");
        landline.disconnectCall();
        landline.dial("6667774");
        landline.disconnectCall();
        landline.dial("6667775");
        landline.disconnectCall();
        landline.dial("7755884");
        landline.disconnectCall();
        landline.dial("7755887");
        landline.disconnectCall();
        landline.dial("7755889");
        landline.disconnectCall();
        landline.dial("5550004");
        landline.disconnectCall();
        landline.dial("5550005");
        landline.disconnectCall();
        landline.dial("5550006");
        landline.disconnectCall();
        landline.dial("5550007");
        landline.disconnectCall();
        landline.dial("5550008");
        landline.disconnectCall();
        landline.dial("5550009");
        landline.disconnectCall();

        // Display the last 10 recent calls for landline
        System.out.println();
        landline.recentCalls();

        // Display details of all Telephone instances
        System.out.println();
        System.out.println("Total calls made: " + Telephone.getTotalCallsMade());
        System.out.println();

        //Testing equals() method
        System.out.println("Compare two Telephone numbers: ");
        System.out.println("If landline1(6667773) equals landline1111(6667773)" + landline1.equals(landline1111));
        System.out.println("If landline1(6667773) equals landline3(5550004)" + landline1.equals(landline3));
        System.out.println("If landline1(6667773) equals landline1(6667773)" + landline1.equals(landline1));
        System.out.println();
        System.out.println(landline);
        System.out.println(mobile);
        System.out.println(satellite);
        System.out.println(landline1);
        System.out.println(mobile1);
        System.out.println(satellite1);
        System.out.println(landline2);
        System.out.println(mobile2);
        System.out.println(satellite2);
        System.out.println(landline3);
        System.out.println(mobile3);
        System.out.println(satellite3);
        System.out.println(landline4);
        System.out.println(mobile4);
        System.out.println(satellite4);
    }
}
// end of class TelephoneTester