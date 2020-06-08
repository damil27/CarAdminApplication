
	$('document').ready(function() {

		$('table #EditButton').on('click',function(event){
            event.preventDefault();

			var href= $(this).attr('href');
			$.get(href, function(employees, status){
			$('#IdEdit').val(employees.id);
            			$('#addressEdit').val(employees.address);
                    			$('#cityEdit').val(employees.city);
                    			$('#countryidEdit').val(employees.countryid);
                    			var dob = employees.dateOfBirth.substr(0,10);
                    			$('#dateOfBirthEdit').val(dob);
                    			$('#emailEdit').val(employees.email);
                    			$('#firstnameEdit').val(employees.firstname);
                    			$('#genderEdit').val(employees.gender);

                    			$('#initialsEdit').val(employees.initials);
                    			$('#lastnameEdit').val(employees.lastname);
                    			$('#maritalStatusEdit').val(employees.maritalStatus);
                    			$('#mobileEdit').val(employees.mobile);
                    			$('#othernameEdit').val(employees.othername);
                    			$('#phoneEdit').val(employees.phone);
                    			$('#fupPhotoEdit').val(employees.photo);
                    			$('#socialSecurityNumberEdit').val(employees.socialSecurityNumber);
                    			$('#stateidEdit').val(employees.stateid);
                    			$('#titleEdit').val(employees.title);
                    			$('#employeeTypeidEdit').val(employees.employeetypeid);
                    			var hireDate = employees.hireDate.substr(0,10);
                    			$('#hireDateEdit').val(employees.hireDate);
                    			$('#jobtitleidEdit').val(employees.jobtitleid);
			});
			$('#editModal').modal();
		});

		$('.table #detailsButton').on('click',function(event) {
			event.preventDefault();
			var href= $(this).attr('href');
			$.get(href, function(Employee, status){
		                                    $('#addressDetails').val(Employee.address);
                                			$('#cityDetails').val(Employee.city);
                                			$('#countryidDetails').val(Employee.countryid);
                                			var dob = Employee.dateOfBirth.substr(0,10);
                                			$('#dateOfBirthDetails').val(dob);
                                			$('#emailDetails').val(Employee.email);
                                			$('#firstnameDetails').val(Employee.firstname);
                                			$('#genderDetails').val(Employee.gender);
                                			$('#IdDetails').val(Employee.id);
                                			$('#initialsDetails').val(Employee.initials);
                                			$('#lastnameDetails').val(Employee.lastname);
                                			$('#maritalStatusDetails').val(Employee.maritalStatus);
                                			$('#mobileDetails').val(Employee.mobile);
                                			$('#othernameDetails').val(Employee.othername);
                                			$('#phoneDetails').val(Employee.phone);
                                			$('#fupPhotoDetails').val(Employee.photo);
                                			$('#socialSecurityNumberDetails').val(Employee.socialSecurityNumber);
                                			$('#stateidDetails').val(Employee.stateid);
                                			$('#titleDetails').val(Employee.title);
                                			$('#employeetypeidDetails').val(Employee.employeetypeid);
                                			var hireDate = Employee.hireDate.substr(0,10);
                                			$('#hireDateDetails').val(hireDate);
                                			$('#jobtitleidDetails').val(Employee.jobtitleid);
			});
			$('#detailsModal').modal();
		});

		$('table #DeleteButton').on('click',function(event) {
			event.preventDefault();
			var href = $(this).attr('href');
            $('#confirmDeleteButton').attr('href', href);

       			$('#deleteModal').modal();
		});

		$('table #photoButton').on('click',function(event) {
			event.preventDefault();
			var href = $(this).attr('href');
            $('#employeePhoto').attr('src', href);

       			$('#photoModal').modal();
		});
	});



