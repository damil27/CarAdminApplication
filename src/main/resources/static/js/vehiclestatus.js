
$('document').ready(function(){
 $('table  #editButton').on('click', function(event){
    event.preventDefault();
// edit functions
     var href = $(this).attr('href');
     $.get(href,function(VehicleStatus,status){
         $(' form #editId').val(VehicleStatus.id);
         $('form #editDescription').val(VehicleStatus.description);
         $(' form #editDetails').val(VehicleStatus.details);
     });
     $('#editModal').modal();
 });

 // show details function

    $('table #detailsButton').on('click', function(event){
     event.preventDefault();

     var href = $(this).attr('href');
     $.get(href, function(VehicleStatus, status){

         $('#detailsId').val(VehicleStatus.id);
         $('#detailsDescription').val(VehicleStatus.description);
         $('#detailsDetails').val(VehicleStatus.details);
     } );
        $('#detailsModal').modal();
    });
// delete finction here
    $('table #deleteButton').on('click', function(event){
       event.preventDefault();
       var href = $(this).attr('href');

       $('#confirmDeleteButton').attr('href', href);

       $('#deleteModal').modal();
    });

});