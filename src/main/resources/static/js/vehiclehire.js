

$('document').ready(function(){
 $('table #editButton').on('click', function(event){
    event.preventDefault();

     var href = $(this).attr('href');
     $.get(href,function(vehicleHire,status){
      $('#idEdit').val(vehicleHire.id);
      			$('#vehicleEdit').val(vehicleHire.vehicleid);
      			$('#clientEdit').val(vehicleHire.clientid);
      			$('#locationEdit').val(vehicleHire.locationid);
      			var dateOut = vehicleHire.dateOut.substr(0,10);
      			var dateIn = vehicleHire.dateIn.substr(0,10);
      			$('#dateOutEdit').val(dateOut);
      			$('#dateInEdit').val(dateIn);
      			$('#priceEdit').val(vehicleHire.price);
      			$('#remarksEdit').val(vehicleHire.remarks);
     });
     $('#editModal').modal();
 });

    $('table #detailsButton').on('click', function(event){
     event.preventDefault();

     var href = $(this).attr('href');
     $.get(href, function(vehicleHire, status){
                $('#idDetails').val(vehicleHire.id);
      			$('#vehicleDetails').val(vehicleHire.vehicleid);
      			$('#clientDetails').val(vehicleHire.clientid);
      			$('#locationDetails').val(vehicleHire.locationid);
      			var dateOut = vehicleHire.dateOut.substr(0,10);
      			var dateIn = vehicleHire.dateIn.substr(0,10);
      			$('#dateOutDetails').val(dateOut);
      			$('#dateInDetails').val(dateIn);
      			$('#priceDetails').val(vehicleHire.price);
      			$('#remarksDetails').val(vehicleHire.remarks);

     } );
        $('#detailsModal').modal();
    });

    $('table #deleteButton').on('click', function(event){
       event.preventDefault();
       var href = $(this).attr('href');

       $('#confirmDeleteButton').attr('href', href);

       $('#deleteModal').modal();
    });

});