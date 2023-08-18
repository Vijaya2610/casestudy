package example.newbean;

/**
 * Hello world!
 *
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.*;
public class App 
{
    public static void main( String[] args )
    {
    	 ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
         Device device = (Device) context.getBean("deviceBean");
         Technician technician = (Technician) context.getBean("technicianBean");
         System.out.println("Device Name: " + device.getDeviceName());
         System.out.println("Days on Rent: " + device.getDaysOnRent());
         System.out.println("Location: " + device.getLocation().getLocationName());

         System.out.println("Technician Name: " + technician.getTechnicianName());
         System.out.println("Technician's Device: " + technician.getDevice().getDeviceName());
    }
}
