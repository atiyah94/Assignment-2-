
public class Car {
	int gear = 1;
	int location;
	int speed = 0;
	final int destination =250;
	
	public void reverseGear(){
		gear = -1; 
	}
	
	public void gearUp(){
		if(gear == 6){
			System.out.println("connot increase the gear anymore");
		}else if(gear==-1){
			gear=1;	
		}else{
			gear=gear+1;
		}
	}
	
	public void gearDown(){
		if(gear == 1){
			System.out.println("connot decrease the gear anymore");
		}else if(gear==-1){
			System.out.println("connot decrease the gear because the car is in reverse gear");
		}else{
			gear=gear- 1;
		}
	}
	
	public int reportGear(){
		return gear;
	}
	
	public int reportLocation(){
		return location;
	}
	
	public int reportRemaining(){
		int remaining = destination- location;
		return remaining;
	} 
	
	public void moveByTime(int time){
		if(time < 0){
			System.out.println("time should be positive");
		}else if(time > 0){
			int speed=gear*20;
			int delta= speed*time;
			location=location + delta;
					
		}
	}
	
	public boolean isArrived(){
		if(location >=destination){
			return true; 
		}
		else {
			return false;
		}
			
	}
		
	}