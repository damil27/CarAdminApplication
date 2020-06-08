

$('document').ready(function(){
 $('table #editButton').on('click', function(event){
    event.preventDefault();

     var href = $(this).attr('href');
     $.get(href,function(state,status){
        $('#editId').val(state.id);
        $('#editName').val(state.name);
        $('#editDetails').val(state.details);
         $('#editCountry').val(state.countryid);

     });
     $('#editModal').modal();
 });

    $('table #detailsButton').on('click', function(event){
     event.preventDefault();

     var href = $(this).attr('href');
     $.get(href, function(state, status){

         $('#detailsId').val(state.id);

           $('#detailsName').val(state.name);
         $('#detailsDetails').val(state.details);
         $('#detailsCountry').val(state.countryid);
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