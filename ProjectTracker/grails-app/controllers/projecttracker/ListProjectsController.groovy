package projecttracker

class ListProjectsController {

	def index = {
		redirect(action: current)
	}
	
    def current = { 
		render "Project Tracker video tutorials"
	}
	
	def overdue = {
		render "Order Valentines Day Package"
	}
}
