public class DigitalClock {
  public static void main(String args[]) throws InterruptedException {
    // Loop indefinitely to make the clock tick
    while (true) {
      // Get the current time in milliseconds
      long timeInMilliseconds = System.currentTimeMillis();

      // Convert the time to hours(adding 2 because current time now is GMT), minutes, and seconds
      long hours = timeInMilliseconds / (60 * 60 * 1000) % 24+2;
      long minutes = timeInMilliseconds / (60 * 1000) % 60;
      long seconds = timeInMilliseconds / 1000 % 60;
  
      // Format the time as a string
      String timeString = String.format("%02d:%02d:%02d", hours, minutes, seconds);
  
      // Print the time to the console
      System.out.println(timeString);
  
      // Wait for one second before updating the time again
      Thread.sleep(1000);
    }
  }
}
