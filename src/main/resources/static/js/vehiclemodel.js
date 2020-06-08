//
//$('document').ready(function(){
//    $('table #editButton').on('click',function(event){
//  event.preventDefault();
//            var href =$(this).attr('href');
//
//        $.get(href, function(country, status){

//});//            $('#editId').val(country.id);
//           $('#editDescription').val(country.description);
//            $('#editNationality').val(country.nationality);
//
//        });
//
//        $('#editModal').modal();
//    });
//




$('document').ready(function(){
 $('table #editButton').on('click', function(event){
    event.preventDefault();

     var href = $(this).attr('href');
     $.get(href,function(VehicleModel,status){
        $('#editId').val(VehicleModel.id);
        $('#editDescription').val(VehicleModel.description);
        $('#editDetails').val(VehicleModel.details);
     });
     $('#editModal').modal();
 });

    $('table #detailsButton').on('click', function(event){
     event.preventDefault();

     var href = $(this).attr('href');
       $.get(href,function(VehicleModel,status){
             $('#detailsId').val(VehicleModel.id);
             $('#detailsDescription').val(VehicleModel.description);
             $('#detailsDetails').val(VehicleModel.details);
             $('#createdByDetails').val(VehicleModel.createdBy);
             $('#createdDateDetails').val(VehicleModel.createdDate.substr(0,19).replace("T"," ") );
             $('#lastModifiedByDetails').val(VehicleModel.lastModifiedBy);
             $('#lastModifiedDateDetails').val(VehicleModel.lastModifiedDate.substr(0,19).replace("T"," ") );

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