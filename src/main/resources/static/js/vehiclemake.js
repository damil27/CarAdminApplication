


$('document').ready(function(){
 $('table #editButton').on('click', function(event){
    event.preventDefault();

     var href = $(this).attr('href');
     $.get(href,function(vehiclemake,status){
        $('#editId').val(vehiclemake.id);
         $('#editDescription').val(vehiclemake.description);
         $('#editDetails').val(vehiclemake.details);

     });
     $('#editModal').modal();
 });

    $('table #detailsButton').on('click', function(event){
     event.preventDefault();

     var href = $(this).attr('href');
     $.get(href, function(vehiclemake, status){


     $('#detailsId').val(vehiclemake.id);
         $('#detailsDescription').val(vehiclemake.description);
         $('#detailsDetails').val(vehiclemake.details);
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