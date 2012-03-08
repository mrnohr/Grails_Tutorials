package projecttracker

class ListProjectsController {

	def index = {
		redirect(action: current)
	}
	
    def current = { 
		def projectName = "Project Tracker video tutorials"
		def dueDate = "3/8/11"
		[project:projectName, date:dueDate]
	}
	
	def overdue = {
		render "Order Valentines Day Package"
	}
}
