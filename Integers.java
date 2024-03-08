
/* with provided data calculate the light speed */

public class Integers {
    public static void main(String[] args) {
        int lightSpeed;
        long days;
        long seconds;
        long distance;

        // approximate speed of light in miles per second
        lightSpeed= 186000;
        days= 1000;
        seconds = days *24 * 60 * 60; // coverting to seconds
        distance= lightSpeed* seconds; // compute the distance
        System.out.println("In "+ days + " days light will travel about "+ distance + " miles" );

    }
}
