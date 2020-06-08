
	$('document').ready(function() {

		$('table #EditButton').on('click',function(event){
            event.preventDefault();

			var href= $(this).attr('href');
			$.get(href, function(Vehicle, status){
			var acDate = vehicle.acquisitionDate.substr(0,10);
            			$('#acquisitionDateEdit').val(acDate);
            			$('#descriptionEdit').val(vehicle.description);
            			$('#employeeidEdit').val(vehicle.employeeid);
            			$('#fuelCapacityEdit').val(vehicle.fuelCapacity);
            			$('#IdEdit').val(vehicle.id);
            			$('#locationidEdit').val(vehicle.locationid);
            			$('#nameEdit').val(vehicle.name);
            			$('#netWeighttEdit').val(vehicle.netWeight);
            			$('#powerEdit').val(vehicle.power);

            			var regDate = vehicle.registrationDate.substr(0,10);
            			$('#registrationDateEdit').val(regDate);

            			$('#remarksEdit').val(vehicle.remarks);
            			$('#vehiclemakeidEdit').val(vehicle.vehiclemakeid);
            			$('#vehiclemodelidEdit').val(vehicle.vehiclemodelid);
            			$('#vehicleNumberEdit').val(vehicle.vehicleNumber);
            			$('#vehiclestatusidEdit').val(vehicle.vehiclestatusid);
            			$('#vehicletypeidEdit').val(vehicle.vehicletypeid);
			});
			$('#editModal').modal();
		});

		$('.table #detailsButton').on('click',function(event) {
			event.preventDefault();
			var href= $(this).attr('href');
			$.get(href, function(Vehicle, status){
		    var acDate = vehicle.acquisitionDate.substr(0,10);
                    			$('#acquisitionDateDetails').val(acDate);
                    			$('#descriptionDetails').val(vehicle.description);
                    			$('#employeeidDetails').val(vehicle.employeeid);
                    			$('#fuelCapacityDetails').val(vehicle.fuelCapacity);
                    			$('#IdDetails').val(vehicle.id);
                    			$('#locationidDetails').val(vehicle.locationid);
                    			$('#nameDetails').val(vehicle.name);
                    			$('#netWeighttDetails').val(vehicle.netWeight);
                    			$('#powerDetails').val(vehicle.power);

                    			var regDate = vehicle.registrationDate.substr(0,10);
                    			$('#registrationDateDetails').val(regDate);

                    			$('#remarksDetails').val(vehicle.remarks);
                    			$('#vehiclemakeidDetails').val(vehicle.vehiclemakeid);
                    			$('#vehiclemodelidDetails').val(vehicle.vehiclemodelid);
                    			$('#vehicleNumberDetails').val(vehicle.vehicleNumber);
                    			$('#vehiclestatusidDetails').val(vehicle.vehiclestatusid);
                    			$('#vehicletypeidDetails').val(vehicle.vehicletypeid);
			});
			$('#detailsModal').modal();
		});

		$('table #DeleteButton').on('click',function(event) {
			event.preventDefault();
			var href = $(this).attr('href');
            $('#confirmDeleteButton').attr('href', href);

       			$('#deleteModal').modal();
		});
	});



