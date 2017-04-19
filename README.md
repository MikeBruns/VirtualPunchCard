# VirtualPunchCard

A Java application that allows users to easily manage work hours,
and managers to proctor employees work schedules.

<b>Functionalites Include:</b>
<ul>
<li>Enter work hours</li>
<li>Track work hours</li> 
<li>Calculate salaries</li>
<li>Request time off</li>
<li>Manage users (Admin)</li>
</ul>
<br/>

<h2>Dependencies</h2>
<ul>
<li>Java 8</li>
<li>Maven 3 or greater</li>
<li>sqlite3</li>
<li>sqlite 3.16 library or greater</li>
</ul>
<br/>

<h2>How to contribute</h2>

1. Fork repo and clone it

	`git clone https://github.com/MikeBruns/VirtualPunchCard.git`

2. Go into the project
	
	`cd /VirtualPunchCard`

3. Package the project
	
	`mvn package`

4. Run it

	`java -cp target/VirtualPunchCard-1.0-SNAPSHOT.jar com.VirtualPunchCard.app.Driver`

5. Install dependencies

6. Import project into choosen IDE as a Java project

7. Create a link between the local copy and original

	`git remote add upstream https://github.com/MikeBruns/VirtualPunchCard.git`

8. Pull from original repo before working on the code

	`git pull upstream master`

9. Create an issue in the issues tab or ask to be assigned an existing issue
10. Make changes to files
11. Push changes to your forked repo

	`git push orign master`

12. Make a pull request to the original repo
13. Celebrate!!!

<br/>

<h2>Project Flow (in the works)</h2>
Login page
	
	> Checks db for authentication
	> Grants access or prompts error in credentials
	
User window to enter hours

	> Date(s) of work 
		○ Be able to select more than one date
	> # of hours completed that day
	> Type of work 
		○ Sick, vacation, holiday, unexcused, weather, training, disability, excused
	> Job worked on / Job #
	> Submit button to push changes to db
	> Change date to be able to view and change times already entered
		○ Calendar view to easily change while also viewing time info
	> Sign out option
