package Algoritmos.DesignPatterns.Comportamental;

//State design pattern is one of the behavioral design pattern. 
//State design pattern is used when an Object change its behavior based on its internal state.


public class StatePattern {
	static class FanWallControl {
		private SpeedLevel current;

		public FanWallControl() {
			current = new Off();
		}

		public void set_state(SpeedLevel state) {
			current = state;
		}

		public void rotate() {
			current.rotate(this);
		}

		@Override
		public String toString() {
			return String.format(
					"FanWallControl [current=%s]", current);
		}
	}

	interface SpeedLevel {
		void rotate(FanWallControl fanWallControl);
	}

	static class Off implements SpeedLevel {
		public void rotate(FanWallControl fanWallControl) {
			fanWallControl.set_state(new SpeedLevel1());
		}
	}

	static class SpeedLevel1 implements SpeedLevel {
		public void rotate(FanWallControl fanWallControl) {
			fanWallControl.set_state(new SpeedLevel2());
		}
	}

	static class SpeedLevel2 implements SpeedLevel {
		public void rotate(FanWallControl fanWallControl) {
			fanWallControl.set_state(new SpeedLevel3());
		}
	}

	static class SpeedLevel3 implements SpeedLevel {
		public void rotate(FanWallControl fanWallControl) {
			fanWallControl.set_state(new Off());
		}
	}

	public static void main(String[] args) {
		FanWallControl fanControl = new FanWallControl();
		System.out.println(fanControl);
		fanControl.rotate();
		System.out.println(fanControl);
		fanControl.rotate();
		System.out.println(fanControl);
		fanControl.rotate();
		System.out.println(fanControl);
		fanControl.rotate();
		
		/*
		 * 
		 * FanWallControl [current=com.rithus.patterns.StatePattern$Off@7a6d084b]
FanWallControl [current=com.rithus.patterns.StatePattern$SpeedLevel1@2352544e]
FanWallControl [current=com.rithus.patterns.StatePattern$SpeedLevel2@457471e0]
FanWallControl [current=com.rithus.patterns.StatePattern$SpeedLevel3@7ecec0c5]
		 * 
		 */
	}
}