
	$('document').ready(function() {

		$('table #EditButton').on('click',function(event){
            event.preventDefault();

			var href= $(this).attr('href');
			$.get(href, function(Client, status){
				$('#editAddress').val(Client.address);
				$('#editCity').val(Client.city);
				$('#editCountry').val(Client.countryid);
				$('#editEmail').val(Client.email);
				$('#editId').val(Client.id);
				$('#editMobile').val(Client.mobile);
				$('#editName').val(Client.name);
				$('#editPhone').val(Client.phone);
				$('#editDetails').val(Client.details);
				$('#editState').val(Client.stateid);
				$('#editWebsite').val(Client.website);
			});
			$('#editModal').modal();
		});

		$('table #detailsButton').on('click',function(event) {
			event.preventDefault();
			var href= $(this).attr('href');
			$.get(href, function(Client, status){
			            	$('#detailsId').val(Client.id);
			                $('#editAddress').val(Client.address);
            				$('#detailsCity').val(Client.city);
            				$('#detailsCountry').val(Client.countryid);
            				$('#detailsEmail').val(Client.email);

            				$('#detailsMobile').val(Client.mobile);
            				$('#detailsName').val(Client.name);
            				$('#detailsPhone').val(Client.phone);
            				$('#detailsDetails').val(Client.details);
            				$('#detailsState').val(Client.stateid);
            				$('#detailsWebsite').val(Client.website);
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



