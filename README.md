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

<b>Dependencies</b><hr/>
<ul>
<li>Java 8</li>
<li>sqlite3</li>
<li>sqlite 3.16 library or greater</li>
</ul>
<br/>
<b>How to contribute</b></br><hr/>



<b>Fork repo</b>

	git clone https://github.com/MikeBruns/VirtualPunchCard.git

<b>Install dependencies</b>

<b>Import project into choosen IDE as a Java project</b>

<b>Create a link between the local copy and original</b>

	git remote add upstream https://github.com/MikeBruns/VirtualPunchCard.git

<b>Pull from original repo before working on the code</b>

	git pull upstream master

<b>Make changes to files...</b>

<b>Push changes to your forked repo</b>

	git push orign master

<b>Make a pull request to the original repo</b>
<b>Celebrate!!!</b>

<br/><br/>



<b>Project Flow (in the works)</b>
<hr/>
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
