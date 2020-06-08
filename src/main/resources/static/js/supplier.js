
	$('document').ready(function() {

		$('table #EditButton').on('click',function(event){
            event.preventDefault();

			var href= $(this).attr('href');
			$.get(href, function(supplier, status){
				$('#editAddress').val(supplier.address);
				$('#editCity').val(supplier.city);
				$('#editCountry').val(supplier.countryid);
				$('#editEmail').val(supplier.email);
				$('#editId').val(supplier.id);
				$('#editMobile').val(supplier.mobile);
				$('#editName').val(supplier.name);
				$('#editPhone').val(supplier.phone);
				$('#editMobile').val(supplier.mobile);
				$('#editState').val(supplier.stateid);
				$('#editWebsite').val(supplier.website);
			});
			$('#editModal').modal();
		});

//		$('.table #detailsButton').on('click',function(event) {
//			event.preventDefault();
//			var href= $(this).attr('href');
//			$.get(href, function(country, status){
//				$('#idDetails').val(country.id);
//				$('#descriptionDetails').val(country.description);
//				$('#codeDetails').val(country.code);
//				$('#lastModifiedByDetails').val(country.lastModifiedBy);
//				$('#lastModifiedDateDetails').val(country.lastModifiedDate.substr(0,19).replace("T", " "));
//			});
//			$('#detailsModal').modal();
//		});

		$('table #DeleteButton').on('click',function(event) {
			event.preventDefault();
			var href = $(this).attr('href');
            $('#confirmDeleteButton').attr('href', href);

       			$('#deleteModal').modal();
		});
	});



