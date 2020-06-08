


$('document').ready(function(){
 $('table #editButton').on('click', function(event){
    event.preventDefault();

     var href = $(this).attr('href');
     $.get(href,function(jobTitle,status){
        $('#editId').val(jobTitle.id);
         $('#descriptEdit').val(jobTitle.description);
         $('#editDetails').val(jobTitle.details);

     });
     $('#editModal').modal();
 });

    $('table #detailsButton').on('click', function(event){
     event.preventDefault();

     var href = $(this).attr('href');
     $.get(href, function(jobTitle, status){
     $('#detailsId').val(jobTitle.id);
         $('#detailsDescription').val(jobTitle.description);
         $('#detailsDetails').val(jobTitle.details);
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