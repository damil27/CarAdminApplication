


$('document').ready(function(){
 $('table #editButton').on('click', function(event){
    event.preventDefault();

     var href = $(this).attr('href');
     $.get(href,function(location,status){
        $('#editId').val(location.id);
         $('#EditDescription').val(location.description);
         $('#editDetails').val(location.details);

     });
     $('#editModal').modal();
 });

    $('table #detailsButton').on('click', function(event){
     event.preventDefault();

     var href = $(this).attr('href');
     $.get(href, function(location, status){


     $('#detailsId').val(location.id);
         $('#detailsDescription').val(location.description);
         $('#detailsDetails').val(location.details);
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