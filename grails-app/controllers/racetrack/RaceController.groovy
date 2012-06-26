package racetrack

class RaceController {
	def scaffold = Race
	
	def index() {
		render "Hello world."
	}
	
	def foo(){
		render "foo"
	}
}
