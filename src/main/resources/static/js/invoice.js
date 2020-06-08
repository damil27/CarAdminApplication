

$('document').ready(function(){
 $('table #editButton').on('click', function(event){
    event.preventDefault();

     var href = $(this).attr('href');
     $.get(href,function(invoice,status){
        $('#editInvoicedate').val(invoice.invoiceDate);
        $('#editClient').val(invoice.clientid);
        $('#statusEdit').val(invoice.invoiceStatusid);
        $('#editRemarks').val(invoice.remarks);

     });
     $('#editModal').modal();
 });

    $('table #detailsButton').on('click', function(event){
     event.preventDefault();

     var href = $(this).attr('href');
     $.get(href, function(invoice, status){
$('#editInvoicedate').val(invoice.id);
        $('#detailsClient').val(invoice.clientid);
        $('#detailsInvoiceStatus').val(invoice.invoiceStatusid);
        $('#detailsRemarks').val(invoice.remarks);

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