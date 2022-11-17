package com.nighthawk.spring_portfolio.mvc.calendar;

/** Simple POJO 
 * Used to Interface with APCalendar
 * The toString method(s) prepares object for JSON serialization
 * Note... this is NOT an entity, just an abstraction
 */
class Year {
   private int year;
   private boolean isLeapYear;
   private int firstDayOfYear;
   private int dayOfYear;

   // zero argument constructor
   public Year() {} 

   /* year getter/setters */
   public int getYear() {
      return year;
   }
   public void setYear(int year) {
      this.year = year;
      this.setIsLeapYear(year);
      this.firstDayOfYear(year);
   }

   /* isLeapYear getter/setters */
   public boolean getIsLeapYear(int year) {
      return APCalendar.isLeapYear(year);
   }
   private void setIsLeapYear(int year) {  // this is private to avoid tampering
      this.isLeapYear = APCalendar.isLeapYear(year);
   }

   /* isLeapYearToString formatted to be mapped to JSON */
   public String isLeapYearToString(){
      return ( "{ \"year\": "  +this.year+  ", " + "\"isLeapYear\": "  +this.isLeapYear+ " }" );
   }	


   /* firstDayOfYear getter/setters */
   public int firstDayOfYear(int year) {
      return APCalendar.firstDayOfYear(year);
   }
   private void setFirstDayOfYear(int year) {  // this is private to avoid tampering
      this.firstDayOfYear = APCalendar.firstDayOfYear(year);
   }

   /* isfirstDayOfYearToString formatted to be mapped to JSON */
   public String firstDayOfYearToString(){
      return ( "{ \"year\": "  +this.year+  ", " + "\"First day of year\": "  +this.firstDayOfYear+ " }" );
   }	


   /* firstDayOfYear getter/setters */
   public int dayOfYear(int month, int day, int year) {
      return APCalendar.dayOfYear(month, day, year);
   }
   private void setDayOfYear(int month, int day, int year) {  // this is private to avoid tampering
      this.firstDayOfYear = APCalendar.dayOfYear(month, day, year);
   }

   /* isfirstDayOfYearToString formatted to be mapped to JSON */
   public String dayOfYearToString(){
      return ( "{ \"year\": "  +this.year+  ", " + "\"First day of year\": "  +this.dayOfYear+ " }" );
   }	

   /* standard toString placeholder until class is extended */
   public String toString() { 
      return isLeapYearToString(); 
   }

   public static void main(String[] args) {
      Year year = new Year();
      year.setYear(2022);
      System.out.println(year);
   }
}