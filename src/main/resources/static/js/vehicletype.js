


$('document').ready(function(){
 $('table #editButton').on('click', function(event){
    event.preventDefault();
// edit functions
     var href = $(this).attr('href');
     $.get(href,function(VehicleType,status){
        $('#editId').val(VehicleType.id);
        $('#editDescription').val(VehicleType.description);
        $('#editDetails').val(VehicleType.details);
     });
     $('#editModal').modal();
 });

 // show details function

    $('table #detailsButton').on('click', function(event){
     event.preventDefault();

     var href = $(this).attr('href');
     $.get(href, function(VehicleType, status){

         $('#detailsId').val(VehicleType.id);

         $('#detailsDescription').val(VehicleType.description);
         $('#detailsDetails').val(VehicleType.details);
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