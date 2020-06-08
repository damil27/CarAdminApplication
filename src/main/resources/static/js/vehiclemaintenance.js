

$('document').ready(function(){
 $('table #editButton').on('click', function(event){
    event.preventDefault();

     var href = $(this).attr('href');
     $.get(href,function(vehicleMaintenance,status){
        $('#idEdit').val(vehicleMaintenance.id);
        $('#VehicleEdit').val(vehicleMaintenance.vehicleid);
        $('#startDateEdit').val(vehicleMaintenance.startDate);
        $('#remarksEdit').val(vehicleMaintenance.remarks);
        $('#endDateEdit').val(vehicleMaintenance.endDate);
        $('#SupplierEdit').val(vehicleMaintenance.supplierid);
        $('#priceEdit').val(vehicleMaintenance.price);

     });
     $('#editModal').modal();
 });

    $('table #detailsButton').on('click', function(event){
     event.preventDefault();

     var href = $(this).attr('href');
     $.get(href, function(vehicleMaintenance, status){
                $('#idDetails').val(vehicleMaintenance.id);
                $('#VehicleDetails').val(vehicleMaintenance.vehicleid);
                $('#startDateDetails').val(vehicleMaintenance.startDate);
                $('#remarksDetails').val(vehicleMaintenance.remarks);
                $('#endDateDetails').val(vehicleMaintenance.endDate);
                $('#SupplierDetails').val(vehicleMaintenance.supplierid);
                 $('#priceDetails').val(vehicleMaintenance.price);

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